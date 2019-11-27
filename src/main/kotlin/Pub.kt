import io.reactivex.subjects.PublishSubject

fun main() {
    val publishSubject: PublishSubject<Int> = PublishSubject.create()
    publishSubject.onNext(1)
    publishSubject.subscribe { println("first: $it") }
    publishSubject.onNext(2)
    publishSubject.subscribe { println("second: $it") }
    publishSubject.onNext(3)
}
