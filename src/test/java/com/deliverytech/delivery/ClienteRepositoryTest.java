@SpringBootTest
@RunWith(SpringRunner.class)
public class ClienteRepositoryTest {

    @Autowired
    private ClienteRepository clienteRepository;

    @Test
    public void deveBuscarClientePorEmail() {
        Cliente cliente = new Cliente("João", "joao@email.com", true);
        clienteRepository.save(cliente);

        Optional<Cliente> resultado = clienteRepository.findByEmail("joao@email.com");

        assertTrue(resultado.isPresent());
        assertEquals("João", resultado.get().getNome());
    }
}
