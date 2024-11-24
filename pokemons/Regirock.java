package pokemons;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import moves.Superpower;
import moves.IronDefense;
import moves.Swagger;
import moves.RockPolish;
public class Regirock extends Pokemon{
	public Regirock(String name, int level){
		super(name, level);
		setStats(80, 100, 200, 50, 100, 50);
		setType(Type.ROCK);
		Superpower spower = new Superpower();
		IronDefense idef = new IronDefense();
		Swagger swagger = new Swagger();
		RockPolish RockP = new RockPolish();
		addMove(spower);
		addMove(idef);
		addMove(swagger);
		addMove(RockP);
	}
}