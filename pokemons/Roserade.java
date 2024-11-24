package pokemons;
import pokemons.Roselia;
import ru.ifmo.se.pokemon.Type;
import moves.SweetScent;

public class Roserade extends Roselia{
	public Roserade(String name, int level){
		super(name, level);
		setStats(60, 70, 65, 125, 105, 90);
		SweetScent sweets = new SweetScent();
		addMove(sweets);
	}
}