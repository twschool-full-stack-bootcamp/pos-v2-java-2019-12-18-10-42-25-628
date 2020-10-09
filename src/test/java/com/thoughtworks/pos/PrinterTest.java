package com.thoughtworks.pos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    @Test
    public void should_return_receipt_given_5_cola_2_sprite_3_battery() {

        Printer printer = new Printer();

        String result = "***<store earning no money>Receipt ***\n"
            + "Name: Coca-Cola, Quantity: 5, Unit price: 3 (yuan), Subtotal: 15 (yuan)\n"
            + "Name: Sprite, Quantity: 2, Unit price: 3 (yuan), Subtotal: 6 (yuan)\n"
            + "Name: Battery, Quantity: 1, Unit price: 2 (yuan), Subtotal: 2 (yuan)\n"
            + "----------------------\n"
            + "Total: 23 (yuan)\n"
            + "**********************";

        String[] cart = PosDataLoader.loadCart();

        assertEquals(result, printer.print(cart));
    }
}