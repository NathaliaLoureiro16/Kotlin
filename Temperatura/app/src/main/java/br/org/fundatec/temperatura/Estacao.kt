package br.org.fundatec.temperatura

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Estacao {

    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("data")
    @Expose
    var data: String? = null
    @SerializedName("endereco")
    @Expose
    var endereco: String? = null
    @SerializedName("bairro")
    @Expose
    var bairro: String? = null
    @SerializedName("temperaturaInterna")
    @Expose
    var temperaturaInterna: Float? = null
    @SerializedName("umidadeInterna")
    @Expose
    var umidadeInterna: Int? = null
    @SerializedName("temperaturaExterna")
    @Expose
    var temperaturaExterna: Float? = null
    @SerializedName("umidadeExterna")
    @Expose
    var umidadeExterna: Int? = null
    @SerializedName("chuvaDiaria")
    @Expose
    var chuvaDiaria: Float? = null
    @SerializedName("pressao")
    @Expose
    var pressao: Float? = null
    @SerializedName("velocidadeVento")
    @Expose
    var velocidadeVento: Int? = null
    @SerializedName("direcaoVento")
    @Expose
    var direcaoVento: Int? = null
    @SerializedName("velocidadeVentoRajada")
    @Expose
    var velocidadeVentoRajada: Int? = null
    @SerializedName("direcaoVentoRajada")
    @Expose
    var direcaoVentoRajada: Int? = null
    @SerializedName("quadranteVento")
    @Expose
    var quadranteVento: String? = null
    @SerializedName("sensacaoTermica")
    @Expose
    var sensacaoTermica: Float? = null
    @SerializedName("pontoOrvalho")
    @Expose
    var pontoOrvalho: Float? = null
    @SerializedName("alturaNuvens")
    @Expose
    var alturaNuvens: Any? = null
    @SerializedName("estacao")
    @Expose
    var estacao: String? = null
    @SerializedName("idRessonare")
    @Expose
    var idRessonare: Int? = null
    @SerializedName("latitude")
    @Expose
    var latitude: Float? = null
    @SerializedName("longitude")
    @Expose
    var longitude: Float? = null
    @SerializedName("iconePrevisao")
    @Expose
    var iconePrevisao: Any? = null
    @SerializedName("temperaturaMinimaPrevisao")
    @Expose
    var temperaturaMinimaPrevisao: Any? = null
    @SerializedName("temperaturaMaximaPrevisao")
    @Expose
    var temperaturaMaximaPrevisao: Any? = null

}