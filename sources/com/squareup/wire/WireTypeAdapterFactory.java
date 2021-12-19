package com.squareup.wire;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.google.gson.b.a;
import com.google.gson.f;
import com.google.gson.v;
import com.google.gson.w;
import java.util.HashMap;
import java.util.Map;
import k.i;

public final class WireTypeAdapterFactory implements w {
    private final Map<Class, Pair<Message, WireDeserializeErrorListener>> defaultValue = new HashMap();

    static {
        Covode.recordClassIndex(36143);
    }

    public final void registerDefaultValue(Message message, WireDeserializeErrorListener wireDeserializeErrorListener) {
        this.defaultValue.put(message.getClass(), new Pair<>(message, wireDeserializeErrorListener));
    }

    @Override // com.google.gson.w
    public final <T> v<T> create(f fVar, a<T> aVar) {
        Class<? super T> cls = aVar.rawType;
        if (cls.equals(i.class)) {
            return new ByteStringTypeAdapter();
        }
        Pair<Message, WireDeserializeErrorListener> pair = this.defaultValue.get(cls);
        if (pair != null) {
            return new DefaultValueMessageTypeAdapter(fVar, aVar, "", (Message) pair.first, (WireDeserializeErrorListener) pair.second);
        }
        if (Message.class.isAssignableFrom(cls)) {
            return new MessageTypeAdapter(fVar, aVar);
        }
        return null;
    }
}
