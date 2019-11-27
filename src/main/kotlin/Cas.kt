import io.reactivex.Observable
import io.reactivex.disposables.Disposable
import io.reactivex.subjects.BehaviorSubject

fun main() {
    val behaviorSubject: BehaviorSubject<Int> = BehaviorSubject.create()
    behaviorSubject.onNext(1)
    val observable: Observable<Int> = behaviorSubject

    val firstDisposable = observable.subscribe { println("first: $it") }
    behaviorSubject.onNext(2)
    val secondDisposable = observable.subscribe { println("second: $it") }
    behaviorSubject.onNext(3)

    firstDisposable.dispose()
    behaviorSubject.onNext(4)
    secondDisposable.dispose()
    behaviorSubject.onNext(5)
}
