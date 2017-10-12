public class PetSold extends ItemSold {
    public boolean vaccinated;
    public boolean neutered;
    public boolean houseBroken;

    public void setHouseBroken(boolean houseBroken) {
        this.houseBroken = houseBroken;
    }

    public void setNeutered(boolean neutered) {
        this.neutered = neutered;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public boolean getHouseBroken(){
        return houseBroken;
    }
    public boolean getNeutered(){
        return neutered;
    }
    public boolean getVaccinated(){
        return vaccinated;
    }
}
