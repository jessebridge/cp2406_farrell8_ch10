public class DemoItemsAndPets {
    public static void main(String[] args) {
        ItemSold item = new ItemSold();
        PetSold pet = new PetSold();
        item.setInvoiceNumber(124130);
        item.setDescription(" good stuff doggo");
        item.setPrice(50);
        pet.setInvoiceNumber(125020);
        pet.setDescription(" pink fluffly dog");
        pet.setPrice(500);
        pet.setHouseBroken(true);
        pet.setNeutered(false);
        pet.setVaccinated(true);
        System.out.println("Invoice # " + item.getInvoiceNumber());
        System.out.println("Description: " + item.getDescription());
        System.out.println("Price " + item.getPrice() + System.lineSeparator());
        System.out.println("Invoice # " + pet.getInvoiceNumber());
        System.out.println("Description " + pet.getDescription());
        System.out.println("Price " + pet.getPrice());
        System.out.println("House Broken: " + pet.getHouseBroken());
        System.out.println("Neutered: " + pet.getNeutered());
        System.out.println("Vaccinated: " + pet.getVaccinated());
    }
}
