package com.lab2;

import java.util.Objects;

public class Furniture {

  private float cost;
  private int prodYear;
  private String name;
  private String country;

  public Furniture(float cost, int prodYear, String name, String country) {
    if (cost > 0 &&
        prodYear > 0 &&
        prodYear < 2023 &&
        (name != null) &&
        (country != null)) {
      this.cost = cost;
      this.prodYear = prodYear;
      this.country = country;
      this.name = name;
    } else {
      this.country = "Неизвестна";
      this.name = "Без названия";
    }
  }

  public Furniture(){
    this.country = "Неизвестна";
    this.name = "Без названия";
  }

  public float getCost() {
    return cost;
  }

  public void setCost(float cost) {
    if (cost > 0) {
      this.cost = cost;
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

  public float getMonthlyPayment(){
    return (cost * 1.15f) / 12;
  }

  @Override
  public String toString() {
    return String.format("""
        %s
        Цена: %f
        Производитель: %s
        Год производства %d
        """, name, cost, country, prodYear);
  }
}
