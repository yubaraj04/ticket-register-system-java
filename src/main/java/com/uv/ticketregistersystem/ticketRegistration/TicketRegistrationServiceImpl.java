package com.uv.ticketregistersystem.ticketRegistration;

import com.uv.ticketregistersystem.dtos.LineChart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TicketRegistrationServiceImpl implements TicketRegistrationService{
    @Autowired
    private TicketRegistrationRepository repository;

    @Override
    public ResponseEntity<String> save(TicketRegistration registration) {
        try{
            repository.save(registration);
            return ResponseEntity.ok().body("Registered Successfully.");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Failed To Register.");
        }
    }

    @Override
    public TicketRegistration findById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<TicketRegistration> findAll() {
        return repository.findAll();
    }

    @Override
    public TicketRegistration findByReferenceNumber(String referenceNumber) {
      return repository.findByReferenceNumber(referenceNumber).get();
    }

    @Override
    public boolean checkForPayment(String referenceNumber) {
    return false;
    }

    @Override
    public Object generateReferenceNumber() {
        Map<String, String> map = new HashMap<>();
        String max = repository.findMaxReferenceNumber();
        String referenceNumber="REF-001";
        if(max !=null){
            String[] arr= max.split("-");
            int num=Integer.valueOf(arr[1])+1;
            if(num<10)
            referenceNumber="REF-00"+num;
            else if(num<100)
                referenceNumber="REF-0"+num;
            else
                referenceNumber="REF-"+num;
        }
        map.put("referenceNumber",referenceNumber);
        return map;
    }

    @Override
    public List<LineChart> getTotalSeatData() {
        List<LineChart> list = new ArrayList<>();
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.now());
        dates.add(LocalDate.now().minusDays(1));
        dates.add(LocalDate.now().minusDays(2));
        dates.add(LocalDate.now().minusDays(3));
        dates.add(LocalDate.now().minusDays(4));
        dates.add(LocalDate.now().minusDays(5));
        dates.add(LocalDate.now().minusDays(6));

        for(LocalDate date: dates){
            LineChart lc = new LineChart();
            lc.setDate((date));
            lc.setValue(getDailyTotalSeatNumber(date));
            list.add(lc);
        }
        return list;
    }
    public int getDailyTotalSeatNumber(LocalDate date){
        Integer data=0;
        try{
           return  data =repository.getDailyTotalSeat(date);
        }catch (Exception e){
            return data;
        }
    }
}
