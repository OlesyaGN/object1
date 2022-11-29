public class Main {
    public static void main(String[] args) {
       Author gogol = new Author("Николай","Гоголь ");
        Author yesenin = new Author("Сергей","Есенин ");

        Book deadSouls = new Book("Мертвые души",gogol,1842);
        Book letterWoman = new Book("Письмо к женщине",yesenin,1924);
        System.out.println(deadSouls.getTitle()+" "+ deadSouls.getAuthorName()+" "+deadSouls.getAuthorSurName()+
                deadSouls.getPublishingYear());
        System.out.println(letterWoman.getTitle()+" "+ letterWoman.getAuthorName()+" "+letterWoman.getAuthorSurName()+
                letterWoman.getPublishingYear());

        deadSouls.setPublishingYear(1843);
        System.out.println(deadSouls.getTitle()+" "+ deadSouls.getAuthorName()+" "+deadSouls.getAuthorSurName()+
                deadSouls.getPublishingYear());


    }
}