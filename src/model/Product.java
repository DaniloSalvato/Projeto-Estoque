package model;

public class Product {
    private int code;
    private String name;
    private String description;
    private double amount;
    private double price;

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "Código = " + code + "\n" +
                "Nome = " + name + "\n" +
                "Descrição = " + description + "\n" +
                "Quantidade = " + amount +  "\n" +
                "Preço = " + price + "\n";
    }

    public String total(){
        return  "Código = " + code + "\n" +
                "Nome = " + name + "\n" +
                "Descrição = " + description + "\n" +
                "Quantidade = " + amount +  "\n" +
                "Preço unitário = " + price + "\n" +
                "Preço total em estoque = " + (price * amount) + "\n";
    }

    public boolean spare(double qtd){
        if(qtd > 0){
            amount += qtd;
            return true;
            }
            return false;
        }

    public boolean reduce(double qtd){
        if(amount <= qtd){
            qtd -= amount;
            return true;
            }
            return false;
        }

    }
