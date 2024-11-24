package pokemons;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import moves.ShadowBall;
import moves.DazzlingGleam;
public class Budew extends Pokemon{
	public Budew(String name, int level){
		super(name, level);
		setStats(40, 30, 35, 50, 70, 55);
		setType(Type.GRASS, Type.POISON);
		ShadowBall sball = new ShadowBall();
		DazzlingGleam dgleam = new DazzlingGleam();
		addMove(sball);
		addMove(dgleam);
	}
}