package com.company;


    class InvoicePrep {

        private String partNumber;
        private String partDescription;
        private int quantity;
        private double unitPrice;


        public InvoicePrep(String partNumber, String partDescription, int quantity, double unitPrice){
            setPartNumber(partNumber);
            setDescription(partDescription);
            setQuantity(quantity);
            setUnitPrice(unitPrice);
        }

        public void setPartNumber(String partNumber){
            this.partNumber = partNumber;
        }
        public void setDescription(String partDescription){
            this.partDescription = partDescription;
        }
        public void setQuantity(int quantity){
            this.quantity = (quantity < 0) ? 0 : quantity;
        }
        public void setUnitPrice(double unitPrice){
            this.unitPrice = (unitPrice < 0.0) ? 0.0 : unitPrice;
        }

        public String getPartNumber(){
            return partNumber;
        }
        public String getDescription(){
            return partDescription;
        }
        public int getQuantity(){
            return quantity;
        }
        public double getUnitPrice(){
            return unitPrice;
        }
        public double getInvoiceAmount(){
            return getQuantity() * getUnitPrice();
        }
    }


    public class Invoice{
        public static void main(String[] args){


            InvoicePrep mouse = new InvoicePrep("567434", "Mouse for my laptop", 10, 600.0);

            printInvoice(mouse.getPartNumber(), mouse.getDescription(),
                    mouse.getQuantity(), mouse.getUnitPrice(),
                    mouse.getInvoiceAmount());


            InvoicePrep keyboard = new InvoicePrep("890434", "Just another description", -1, -1.0);

            printInvoice(keyboard.getPartNumber(), keyboard.getDescription(),
                    keyboard.getQuantity(), keyboard.getUnitPrice(),
                    keyboard.getInvoiceAmount());

        }


        private static void printInvoice(String num, String desc,int quan, double price, double total){
            System.out.printf("%s: %s - %d * %.2f = %.2f\n", num, desc, quan, price, total);
        }
    }


