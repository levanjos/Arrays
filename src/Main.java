void main() {

    int [] idades = {1, 2, 34, 5};

    List<String> nomes = new ArrayList<>();

    Map<String, Integer> maps = new HashMap<>();
    maps.put("Jonata", 17);
    maps.put("Gabriel", 16);
    maps.put("Jonata", 19);
    IO.println(maps);

    Set<Animal> animais = new HashSet<>();
    animais.add( new Animal("Garfield"));
    IO.println(animais);
}
