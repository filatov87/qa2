package Model;

public class TicketResponse {
    private name Name;
    private lastname surname;
    private From afrom;
    private To ato;
    private Baggage bugs;
    private Discount discount;
    private Adults adults;
    private Kids kids;
    private Seat seat;

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Surname getSurname() {
        return surname;
    }

    public void setSurname(Surname surname) {
        this.surname = surname;
    }

    public String getAfrom() {
        return afrom;
    }

    public void setAfrom(From afrom) {
        this.afrom = afrom;
    }

    public String getAto() {
        return ato;
    }

    public void setAto(To ato) {
        this.ato = ato;
    }

    public Baggage getBugs() {
        return bugs;
    }

    public void setName(firstname name) {
        this.name = name;
    }

    public void setSurname(lastname surname) {
        this.surname = surname;
    }

    public Adults getAdults() {
        return adults;
    }

    public void setAdults(Adults adults) {
        this.adults = adults;
    }

    public Kids getKids() {
        return kids;
    }

    public void setKids(Kids kids) {
        this.kids = kids;
    }

    public void setBugs(Baggage bugs) {

        this.bugs = bugs;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
}
