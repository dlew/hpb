import okhttp3.OkHttpClient
import okhttp3.Request

private val OK_HTTP = OkHttpClient()

fun download(url: String): String {
    val call = OK_HTTP.newCall(
        Request.Builder()
            .url(url)
            .build()
    )

    val response = call.execute()

    return response.body!!.string()
}
