package com.sys.bio.back.services.process.sizing;

import com.sys.bio.back.models.sized.SizedBox;

import java.util.Date;
import java.util.List;
import java.util.Set;

public interface SizedBasketService {
    SizedBox addSizedBasket(SizedBox sizedBox);

    SizedBox updateSizedBasket(SizedBox sizedBox);

    Set<SizedBox> getSizedBaskets();

    SizedBox getSizedBasket(Long sizedBasketId);
    void deleteSizedBasket(Long sizedBasketId);

    List<SizedBox> getSizedBasketsByDateRange(Date startDate, Date endDate);

    List<SizedBox> searchByResponsibleName(String name);

    public List<SizedBox> findAll();
}
