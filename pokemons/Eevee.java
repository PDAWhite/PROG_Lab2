package pokemons;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import moves.QuickAttack;
import moves.TailWhip;
import moves.Confide;
public class Eevee extends Pokemon{
	public Eevee(String name, int level){
		super(name, level);
		setStats(55, 55, 50, 45, 65, 55);
		setType(Type.NORMAL);
		QuickAttack qatt = new QuickAttack();
		TailWhip twhip = new TailWhip();
		Confide conf = new Confide();
		addMove(qatt);
		addMove(twhip);
		addMove(conf);
	}
}