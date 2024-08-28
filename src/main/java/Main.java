import br.com.dio.bootcamp.domain.Bootcamp;
import br.com.dio.bootcamp.domain.Curso;
import br.com.dio.bootcamp.domain.Dev;
import br.com.dio.bootcamp.domain.Mentoria;

public class Main {

    public static void main(String[] args){
        Curso c = new Curso();
        c.setTitulo("Titulo curso");
        c.setDescricao("Descricao curso");
        c.setCargaHoraria(10);

        Mentoria m = new Mentoria();
        m.setTitulo("Titulo mentoria");
        m.setDescricao("Descricao Mentoria");

        System.out.println(c.toString());
        System.out.println(m.toString());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descricao Bootcamp");
        bootcamp.adicionarConteudo(c);
        bootcamp.adicionarConteudo(m);

        Dev dev = new Dev();
        dev.setNome("andre");
        dev.inscreverBootcamp(bootcamp);
        dev.progredir();
        System.out.println(dev.calcularXp());



    }
}
