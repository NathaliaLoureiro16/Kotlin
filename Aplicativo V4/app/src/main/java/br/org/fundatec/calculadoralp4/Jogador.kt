package br.org.fundatec.calculadoralp4

class Jogador (var nome: String, var gols: String, var quedas: String){
    override fun toString(): String {
        return nome + " gols: " + gols + " quedas: " + quedas
    }
}