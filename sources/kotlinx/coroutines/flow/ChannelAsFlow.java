package kotlinx.coroutines.flow;

import com.bytedance.covode.number.Covode;
import h.c.d;
import h.f.b.g;
import h.z;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.a.f;
import kotlinx.coroutines.a.s;
import kotlinx.coroutines.a.u;
import kotlinx.coroutines.am;
import kotlinx.coroutines.ao;
import kotlinx.coroutines.flow.a.a;
import kotlinx.coroutines.flow.a.b;

final class ChannelAsFlow<T> extends a<T> {
    private static final AtomicIntegerFieldUpdater consumed$FU = AtomicIntegerFieldUpdater.newUpdater(ChannelAsFlow.class, "consumed");
    private final u<T> channel;
    private final boolean consume;
    private volatile int consumed;

    static {
        Covode.recordClassIndex(105628);
    }

    private final void markConsumed() {
        if (this.consume && consumed$FU.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
        }
    }

    @Override // kotlinx.coroutines.flow.a.a
    public final String additionalToStringProps() {
        return "channel=" + this.channel + ", ";
    }

    @Override // kotlinx.coroutines.flow.a.a
    public final u<T> produceImpl(am amVar) {
        markConsumed();
        if (this.capacity == -3) {
            return this.channel;
        }
        return super.produceImpl(amVar);
    }

    @Override // kotlinx.coroutines.flow.a.a
    public final f<T> broadcastImpl(am amVar, ao aoVar) {
        markConsumed();
        return super.broadcastImpl(amVar, aoVar);
    }

    @Override // kotlinx.coroutines.flow.a.a
    public final a<T> create(h.c.f fVar, int i2) {
        return new ChannelAsFlow(this.channel, this.consume, fVar, i2);
    }

    @Override // kotlinx.coroutines.flow.a.a
    public final Object collectTo(s<? super T> sVar, d<? super z> dVar) {
        Object a2 = b.a(new b(sVar), this.channel, this.consume, dVar);
        if (a2 == h.c.a.a.COROUTINE_SUSPENDED) {
            return a2;
        }
        return z.f158842a;
    }

    @Override // kotlinx.coroutines.flow.a.a
    public final Object collect(a<? super T> aVar, d<? super z> dVar) {
        if (this.capacity == -3) {
            markConsumed();
            Object a2 = b.a(aVar, this.channel, this.consume, dVar);
            if (a2 == h.c.a.a.COROUTINE_SUSPENDED) {
                return a2;
            }
        } else {
            Object collect = super.collect(aVar, dVar);
            if (collect == h.c.a.a.COROUTINE_SUSPENDED) {
                return collect;
            }
        }
        return z.f158842a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.a.u<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelAsFlow(u<? extends T> uVar, boolean z, h.c.f fVar, int i2) {
        super(fVar, i2);
        this.channel = uVar;
        this.consume = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChannelAsFlow(u uVar, boolean z, h.c.f fVar, int i2, int i3, g gVar) {
        this(uVar, z, (i3 & 4) != 0 ? h.c.g.INSTANCE : fVar, (i3 & 8) != 0 ? -3 : i2);
    }
}
