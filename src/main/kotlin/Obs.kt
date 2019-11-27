import io.reactivex.Observable
import io.reactivex.ObservableEmitter

fun main() {
    var emitter: ObservableEmitter<Int>? = null
    val observable: Observable<Int> = Observable.create {
        emitter = it
        emitter?.onNext(1)
    }
    emitter?.onNext(2)
    observable.subscribe { println("first subscriber: $it") }
    emitter?.onNext(3)
    observable.subscribe { println("second subscriber: $it") }
    emitter?.onNext(4)
}