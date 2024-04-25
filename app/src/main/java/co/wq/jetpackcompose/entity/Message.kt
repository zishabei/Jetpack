package co.wq.jetpackcompose.entity

val conversationSample: List<Message> = listOf(
    Message("Lexi", "Test..Test..Test.."),
    Message(
        "Lexi", """
        Android Market, allowing application downloads and updates through the Market application.
        Web browser to show, zoom and pan full HTML and XHTML web pages – multiple pages show as windows ("cards").[30][31]
    """.trimIndent()
    ),
    Message("Lexi", "From Wikipedia, the free encyclopedia"),
    Message("Lexi", "From Wikipedia, the free encyclopedia"),
    Message("Lexi", "From Wikipedia, the free encyclopedia"),
    Message("Lexi", "From Wikipedia, the free encyclopedia"),
    Message("Lexi", "From Wikipedia, the free encyclopedia"),
    Message("Lexi", "From Wikipedia, the free encyclopedia")
)

data class Message(val author: String, val body: String)