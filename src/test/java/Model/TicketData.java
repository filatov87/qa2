package Model;

import cucumber.api.java.sl.In;

public class TicketData {
    private String Name;
    private String Surname;
    private String From;
    private String To;
    private Integer Baggage;
    private Integer Discount;
    private Integer Children;
    private Integer Adults;
    private Integer Seat;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String from) {
        From = from;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String to) {
        To = to;
    }

    public Integer getBaggage() {
        return Baggage;
    }

    public void setBaggage(Integer baggage) {
        Baggage = baggage;
    }

    public Integer getDiscount() {
        return Discount;
    }

    public void setDiscount(Integer discount) {
        Discount = discount;
    }

    public Integer getChildren() {
        return Children;
    }

    public void setChildren(Integer children) {
        Children = children;
    }

    public Integer getAdults() {
        return Adults;
    }

    public void setAdults(Integer adults) {
        Adults = adults;
    }

    public Integer getSeat() {
        return Seat;
    }

    public void setSeat(Integer seat) {
        Seat = seat;
    }
}
