package co.edu.umanizales.manage_store.service;

import co.edu.umanizales.manage_store.model.Seller;
import co.edu.umanizales.manage_store.model.Store;
import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Data
@Service
@Getter
public class SellerService {
    private List<Seller>sellers;

    public SellerService (){
        sellers = new ArrayList<>();
        sellers.add(new Seller("5","luis"));
      sellers.add(new Seller("6","carlos"));
        sellers.add(new Seller("7","malte"));
        sellers.add(new Seller("8","carrillo"));
    }

    public  void addSeller (Seller seller){ sellers.add(seller);}

    public  Seller getSellerById(String code){

        for (Seller i: sellers){

            if(i.getCode().equalsIgnoreCase(code)) {

                return  i;

            }
        }
        return  null;
    }


}
