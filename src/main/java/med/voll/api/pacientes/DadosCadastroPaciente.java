package med.voll.api.pacientes;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroPaciente(
		@NotBlank
		String nome, 
		
		@NotBlank
		@Email
		String email,
		
		@NotBlank
		@Pattern(regexp = "\\d{8}")
		String telefone,
		
		@NotBlank
		@Pattern(regexp = "\\d{8}")
		String cpf,
		
		@NotNull @Valid
		DadosEndereco endereco ) {

}
