package com.maosencantadas.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Valid
@Builder
@Schema(name = "ArtistaDTO", description = "DTO que representa um artista")
public class ArtistaDTO {

    @Schema(description = "Identifica o artista", example = "1")
    private Long id;

    @NotBlank(message = "Nome é obrigatório")
    @Size(max = 100, message = "Nome deve ter no máximo 100 caracteres")
    @Schema(description = "Nome do artista", example = "Amanda Testando")
    private String nome;

    @Schema(description = "URL da foto do artista", example = "https://example.com/foto.jpg")
    private String foto;

    @Size(max = 200, message = "Endereço deve ter no máximo 200 caracteres")
    @Schema(description = "Endereço do artista", example = "Rua Padre Pio, 123 - Centro")
    private String endereco;

    @Email(message = "Email inválido")
    @Schema(description = "Endereço de email do artista", example = "teste@exemplo.com")
    private String email;

    @Size(max = 20, message = "Telefone deve ter no máximo 20 caracteres")
    @Schema(description = "Número de telefone do artista", example = "(34) 98765-4321")
    private String telefone;

    @Schema(description = "Perfil do Instagram do artista", example = "@testandoartista")
    private String insta;

    @Schema(description = "Perfil do Facebook do artista", example = "facebook.com/testandoartista")
    private String face;

    @Schema(description = "Número do WhatsApp do artista", example = "(11) 91234-5678")
    private String whatsapp;

    @NotBlank(message = "CPF é obrigatório")
    @Size(min = 11, max = 14, message = "CPF deve ter entre 11 e 14 caracteres")
    @Schema(description = "CPF do artista", example = "123.456.789-00")
    private String cpf;

    @Schema(description = "Identificador da categoria do artista", example = "2")
    private Long categoriaId;
}
