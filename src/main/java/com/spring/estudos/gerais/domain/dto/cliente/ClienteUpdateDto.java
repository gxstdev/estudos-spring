package com.spring.estudos.gerais.domain.dto.cliente;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClienteUpdateDto {
    @PositiveOrZero
    private Integer id;

    @NotBlank(message = "O campo nome é obrigatório")
    @Size(max = 40)
    private String nome;

    @NotBlank(message = "O campo CPF é obrigatório")
    private String cpf;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate dataNascimento;

    @NotBlank(message = "O campo telefone é obrigatório")
    @Size(min = 11, max = 15)
    private String numeroTelefone;

    @NotBlank
    @Size(max = 20)
    private String genero;
}
