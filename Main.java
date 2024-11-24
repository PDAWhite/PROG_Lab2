import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import pokemons.Regirock;
public class Main {
	public static void main(String[] args){
		Battle b = new Battle();
		Regirock p1 = new Regirock("Космический камень", 1);
		Pokemon p2 = new Pokemon("Хищник", 1);
		b.addAlly(p1);
		b.addFoe(p2);
		b.go();
	}
	
}
