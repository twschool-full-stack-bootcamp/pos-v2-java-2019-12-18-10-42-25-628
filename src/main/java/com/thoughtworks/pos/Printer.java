package com.thoughtworks.pos;


public class Printer {
    public String print(String[] cart) {

        //Please delete the part below that returns the string directly and redo the logical implementation
        return "***<store earning no money>Receipt ***\n"
            + "Name: Coca-Cola, Quantity: 5, Unit price: 3 (yuan), Subtotal: 15 (yuan)\n"
            + "Name: Sprite, Quantity: 2, Unit price: 3 (yuan), Subtotal: 6 (yuan)\n"
            + "Name: Battery, Quantity: 1, Unit price: 2 (yuan), Subtotal: 2 (yuan)\n"
            + "----------------------\n"
            + "Total: 23 (yuan)\n"
            + "**********************";
    }
}

