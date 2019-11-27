import io.reactivex.subjects.BehaviorSubject

fun main() {
    val behaviorSubject: BehaviorSubject<Int> = BehaviorSubject.create()
    behaviorSubject.onNext(1)
    behaviorSubject.subscribe { println("first: $it") }
    behaviorSubject.onNext(2)
    behaviorSubject.subscribe { println("second: $it") }
    behaviorSubject.onNext(3)
}
