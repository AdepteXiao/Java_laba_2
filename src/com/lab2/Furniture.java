package com.lab2;

import java.text.DecimalFormat;

public class Furniture {

  private final DecimalFormat decimalFormat = new DecimalFormat("#.###");
  private float price;
  private int prodYear;
  private String name;
  private String country;

  public Furniture(float price, int prodYear, String name, String country) {
    if (price > 0 &&
        prodYear > 0 &&
        prodYear < 2023 &&
        (name != null) &&
        (country != null)) {
      this.price = price;
      this.prodYear = prodYear;
      this.country = country;
      this.name = name;
    } else {
      this.country = "Неизвестна";
      this.name = "Без названия";
    }
  }

  public Furniture() {
    this.country = "Неизвестна";
    this.name = "Без названия";
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    if (price > 0) {
      this.price = price;
    }
  }

  public int getProdYear() {
    return prodYear;
  }

  public void setProdYear(int prodYear) {
    if (prodYear > 0 &&
        prodYear < 2023) {
      this.prodYear = prodYear;
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (!(name == null || name.equals(""))) {
      this.name = name;
    }
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    if (!(country == null || country.equals(""))) {
      this.country = country;
    }
  }

  public float getMonthlyPayment() {
    return (price * 1.15f) / 12;
  }

  @Override
  public String toString() {
    return String.format("""
            %s
            Цена: %s
            Страна производитель: %s
            Год производства %d
            Месячная оплата при рассрочке на год: %s
            """,
        name,
        decimalFormat.format(price),
        country,
        prodYear,
        decimalFormat.format(getMonthlyPayment()));
  }
}
