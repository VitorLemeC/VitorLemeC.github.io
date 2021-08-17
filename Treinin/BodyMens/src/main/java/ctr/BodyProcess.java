package ctr;

public class BodyProcess {

	import java.util.ArrayList;

	import vo.Body;
	import voDao.BodyDao;

		public static ArrayList<Body> bodys;
		public static BodyDao jd = new BodyDao();
		
		
		//test
		public static void teste() {
			bodys = new ArrayList<>();
			bodys.add(new Body("Nomee","AparelhoPeito", "Costas","Perna"));
			bodys.add(new Body("The Elder Scrolls V: Skyrim","RPG", "2019"));
			bodys.add(new Body("Crysis","Jogos de Tiro", "2007"));
			bodys.add(new Body("Fallout: New Vegas","RPG", "2010"));
			bodys.add(new Body("Hellblade: Senua's Sacrifice","Acao e Aventura", "2017"));
			bodys.add(new Body("Injustice 2","Luta", "2017"));

		}
		
		public static void abrir() {
			bodys = jd.abrir();
		}
		public static String salvar() {
			if (jd.salvar(bodys)) {
				return "<p> Salvo com sucesso </p>";
			}else {
				return "<p> Erro ao salvar </p>";
			}
			
		}
	}
}
