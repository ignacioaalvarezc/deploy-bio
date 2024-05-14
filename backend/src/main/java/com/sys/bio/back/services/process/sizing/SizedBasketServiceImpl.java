package com.sys.bio.back.services.process.sizing;

import com.sys.bio.back.controllers.user.AuthenticationController;
import com.sys.bio.back.models.sized.SizedBox;
import com.sys.bio.back.repositories.sized.SizedBoxRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class SizedBasketServiceImpl implements SizedBasketService{

    @Autowired
    private SizedBoxRepository sizedBoxRepository;

    private static final Logger log = LoggerFactory.getLogger(AuthenticationController.class);

    @Override
    public SizedBox addSizedBasket(SizedBox sizedBox) {
        return sizedBoxRepository.save(sizedBox);
    }

    @Override
    public SizedBox updateSizedBasket(SizedBox sizedBox) {
        return sizedBoxRepository.save(sizedBox);
    }

    @Override
    public Set<SizedBox> getSizedBaskets() {
        return new LinkedHashSet<>(sizedBoxRepository.findAll());
    }

    @Override
    public SizedBox getSizedBasket(Long sizedBasketId) {
        return sizedBoxRepository.findById(sizedBasketId).get();
    }

    @Override
    public void deleteSizedBasket(Long sizedBasketId) {
        SizedBox sizedBox = new SizedBox();
        sizedBox.setSizedBoxId(sizedBasketId);
        sizedBoxRepository.delete(sizedBox);
    }

    @Override
    public List<SizedBox> searchByResponsibleName(String name) {
        if (name != null) {
            return sizedBoxRepository.findByResponsibleNameContainingIgnoreCase(name);
        } else {
            return Collections.emptyList();
        }
    }


    public List<SizedBox> getSizedBasketsByDateRange(Date startDate, Date endDate) {
        return sizedBoxRepository.findByDateBetween(startDate, endDate);
    }

    @Override
    @Transactional(readOnly = true)
    public List<SizedBox> findAll() {
        return (List<SizedBox>) sizedBoxRepository.findAll();
    }

}
