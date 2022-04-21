package com.example.demo;

import javax.persistence.Entity;

import javax.persistence.Id;


@Entity
public class demo
{
@Id

private Integer id;
private String name;
private float price;
public demo()
{
}
public demo(Integer id, String name, float price)
{
this.id = id;
this.name = name;
this.price = price;
}

public Integer getId()
{
return id;
}
public void setId(Integer id)
{
this.id = id;
}
public String getName()
{
return name;
}
public void setName(String name)
{
this.name = name;
}
public float getPrice()
{
return price;
}
public void setPrice(float price)
{
this.price = price;
}
}