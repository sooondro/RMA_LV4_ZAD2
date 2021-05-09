package hr.ferit.sandroblavicki.rma_lv4_zad2.data.api

class ApiHelper(private val apiService: ApiService) {

    fun getUsers() = apiService.getUsers()

}