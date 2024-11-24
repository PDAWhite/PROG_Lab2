package pokemons;
import pokemons.Budew;
import ru.ifmo.se.pokemon.Type;
import moves.StunSpore;
public class Roselia extends Budew{
	public Roselia(String name, int level){
		super(name, level);
		setStats(50, 60, 45, 100, 80, 65);
		StunSpore stuns = new StunSpore();
		addMove(stuns);
	}
}