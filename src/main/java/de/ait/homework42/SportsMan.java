package de.ait.homework42;

public class SportsMan {
    private String name;
    private int age;
    private String sport;
    private int record;

    public SportsMan(String name, String sport, int age, int record) {
        this.name = name;
        this.sport = sport;
        this.age = age;
        this.record = record;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    @Override
    public String toString() {
        return "SportsMan{" +
                "name='" + name + '\'' +
                ", sport='" + sport + '\'' +
                ", age=" + age +
                ", record=" + record +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }
    //Реализуйте метод updateRecord(int newRecord),
    //который будет обновлять рекорд спортсмена,
    // если newRecord больше текущего рекорда.
    public void setRecord(int record) {
        this.record = record;
    }
    public int updateRecord(int newRecord)
    {
        if(newRecord>this.getRecord())
        {
            setRecord(newRecord);
        }
        else
        {
            setRecord(this.getRecord());
        }
        return newRecord;
    }

    public String getName() {
        return name;
    }

    public String getSport() {
        return sport;
    }

    public int getAge() {
        return age;
    }

    public int getRecord() {
        return this.record;
    }
    public boolean isEligibleForCompetition(int minAge, int maxAge)
    {
        if(this.getAge()>=minAge&&this.getAge()<=maxAge){
            System.out.println("Данный спортсмен может участвовать в соревнованиях");
            return true;
        }
        else {
            System.out.println("Данный спортсмен не может участвовать в соревнованиях");
            return false;
        }

    }

    public static void main(String[] args) {
        SportsMan sportsman=new SportsMan("Один спортсмен","прыжки в лдину",  32, 7);
        sportsman.setRecord(8);
        System.out.println(sportsman.updateRecord(8));
        sportsman.isEligibleForCompetition(18,35);
        System.out.println(sportsman.updateRecord(5));

    }

}
