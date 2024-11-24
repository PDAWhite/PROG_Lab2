package pokemons;
import pokemons.Eevee;
import ru.ifmo.se.pokemon.Type;
import moves.DreamEater;
public class Espeon extends Eevee{
	public Espeon(String name, int level){
		super(name, level);
		setStats(65, 65, 60, 130, 95, 110);
		setType(Type.PSYCHIC);
		DreamEater deat = new DreamEater();
		addMove(deat);
	}
}	