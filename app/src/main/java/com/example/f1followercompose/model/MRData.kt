package com.example.f1followercompose.model

import com.example.f1followercompose.model.standings.StandingsTable
import com.example.f1followercompose.model.circuit.CircuitTable
import com.example.f1followercompose.model.status.StatusTable
import com.example.f1followercompose.model.constructor.ConstructorTable
import com.example.f1followercompose.model.driver.DriverTable
import com.example.f1followercompose.model.race.RaceTable
import com.example.f1followercompose.model.season.SeasonTable
import com.google.gson.annotations.SerializedName

data class MRData(
	val limit: String,
	val offset: String,
	val series: String,
	val total: String,
	val url: String,
	val xmlns: String,
	@SerializedName("DriverTable")
	val driverTable: DriverTable? = null,
	@SerializedName("SeasonTable")
	val seasonTable: SeasonTable? = null,
	@SerializedName("raceTable")
	val raceTable: RaceTable? = null,
	@SerializedName("ConstructorTable")
	val constructorTable: ConstructorTable? = null,
	@SerializedName("StatusTable")
	val statusTable: StatusTable? = null,
	@SerializedName("CircuitTable")
	val circuitTable: CircuitTable? = null,
	@SerializedName("StandingsTable")
	val standingsTable: StandingsTable? = null,
)