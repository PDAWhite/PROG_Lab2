import ru.ifmo.se.pokemon.Battle;
import pokemons.Regirock;
import pokemons.Eevee;
import pokemons.Espeon;
import pokemons.Budew;
import pokemons.Roselia;
import pokemons.Roserade;

public class Main {
        public static void main(String[] args){
                Battle b = new Battle();
                Regirock rock = new Regirock("Космический камень", 10);
                Eevee whatdoesthefoxsay= new Eevee("Котолис", 10);
                Espeon isthatacatfromshoj= new Espeon("Сноед", 10);
                Budew seedling= new Budew("Проросток", 10);
                Roselia roses= new Roselia("Розы", 10);
                Roserade ultimateroses= new Roserade("Розы 2.0", 10);
                b.addAlly(rock);
                b.addAlly(whatdoesthefoxsay);
                b.addAlly(roses);
                b.addFoe(ultimateroses);
                b.addFoe(isthatacatfromshoj);
                b.addFoe(seedling);
                b.go();
        }

}
