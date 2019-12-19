package com.example.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class View {

    private Shipping shipping;

    private List<Shipping> shippingList;

    @Autowired
    public View(Shipping shipping) {
        this.shipping = shipping;
        setDemoList();
    }

    private void setDemoList(){
        this.shippingList = new ArrayList<>();
        this.shippingList.add(new Shipping("p", 1));
        this.shippingList.add(new Shipping("s", 2));
    }

    @GetMapping("/getShippingList")
    public List<Shipping> getShippingList(){
        return shippingList;
    }

}
