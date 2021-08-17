package voDao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import vo.Body;

public class BodyDao {
	private BufferedReader br;
	private BufferedWriter bw;
	private ArrayList<Body> bodys;
	private Body body;
	private String arquivo = "";
	
	public boolean salvar(ArrayList<Body> bodys) {
		try { bw = new BufferedWriter(new FileWriter(arquivo, false));
			for(Body b : bodys) {
				bw.write(b.toCSV());
			}
			bw.close();
			return true;
		}catch(IOException e) {
			System.out.println("Erro ao gravar arquivo" + e);
			return false;
		}
	}
	
	public ArrayList<Body> abrir() {
		bodys = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader(arquivo));
			String linha = null;
			while ((linha = br.readLine()) != null) {
				bodys = new Body(linha.split(";"));
				bodys.add(body);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo n�o encontrado " + e);
		} catch (IOException e) {
			System.out.println("Erro ao ler arquivo " + e);
		}
		return bodys;
	}
	
}
