package com.squareup.wire;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.b.a;
import com.google.gson.c.b;
import com.google.gson.c.c;
import com.google.gson.f;
import com.google.gson.i;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.t;
import com.google.gson.v;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.WireField;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class DefaultValueMessageTypeAdapter<M extends Message<M, B>, B extends Message.Builder<M, B>> extends v<M> {
    private static final BigInteger POWER_64 = new BigInteger("18446744073709551616");
    private final M defaultValue;
    private final Map<String, FieldBinding<M, B>> fieldBindings;
    private final f gson;
    private final WireDeserializeErrorListener listener;
    private final RuntimeMessageAdapter<M, B> messageAdapter;
    private final String path;
    private final a<M> type;

    static {
        Covode.recordClassIndex(36101);
    }

    @Override // com.google.gson.v
    public M read(com.google.gson.c.a aVar) {
        if (aVar.f() == b.NULL) {
            aVar.k();
            return null;
        }
        v a2 = this.gson.a(l.class);
        Message.Builder<M, B> newBuilder = this.defaultValue.newBuilder();
        aVar.c();
        while (aVar.f() != b.END_OBJECT) {
            String h2 = aVar.h();
            FieldBinding<M, B> fieldBinding = this.fieldBindings.get(h2);
            if (fieldBinding == null) {
                aVar.o();
            } else {
                try {
                    Object parseValue = parseValue(fieldBinding, (l) a2.read(aVar), h2, fieldBinding.getFromBuilder(newBuilder));
                    if (parseValue == null && fieldBinding.label == WireField.Label.REQUIRED) {
                        onDeserializeError(new IllegalStateException(h2 + " is null"), h2);
                    } else {
                        fieldBinding.set(newBuilder, parseValue);
                    }
                } catch (Throwable th) {
                    onDeserializeError(th, h2);
                }
            }
        }
        aVar.d();
        try {
            return newBuilder.build();
        } catch (Exception e2) {
            onDeserializeError(e2, null);
            throw e2;
        }
    }

    private void emitUint64(Long l2, c cVar) {
        if (l2.longValue() < 0) {
            cVar.a(POWER_64.add(BigInteger.valueOf(l2.longValue())));
        } else {
            cVar.a(l2);
        }
    }

    private void onDeserializeError(Throwable th, String str) {
        if (this.listener != null) {
            if (!TextUtils.isEmpty(this.path)) {
                str = this.path + "." + str;
            }
            this.listener.onError(this.type.rawType, str, th);
        }
    }

    public void write(c cVar, M m2) {
        if (m2 == null) {
            cVar.f();
            return;
        }
        cVar.d();
        for (FieldBinding<M, B> fieldBinding : this.messageAdapter.fieldBindings().values()) {
            Object obj = fieldBinding.get(m2);
            if (obj != null) {
                cVar.a(fieldBinding.name);
                emitJson(cVar, obj, fieldBinding.singleAdapter(), fieldBinding.label);
            }
        }
        cVar.e();
    }

    private void emitJson(c cVar, Object obj, ProtoAdapter<?> protoAdapter, WireField.Label label) {
        if (protoAdapter != ProtoAdapter.UINT64) {
            this.gson.a(obj, obj.getClass(), cVar);
        } else if (label.isRepeated()) {
            List list = (List) obj;
            cVar.b();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                emitUint64((Long) list.get(i2), cVar);
            }
            cVar.c();
        } else {
            emitUint64((Long) obj, cVar);
        }
    }

    private <T> Object fromJson(l lVar, Class<T> cls, String str, Object obj) {
        String str2 = str;
        v<T> a2 = this.gson.a((Class) cls);
        if (obj == null || !Message.class.isAssignableFrom(cls) || (!(a2 instanceof MessageTypeAdapter) && !(a2 instanceof DefaultValueMessageTypeAdapter))) {
            return this.gson.a(lVar, (Class) cls);
        }
        Message message = (Message) obj;
        com.google.gson.internal.bind.c cVar = new com.google.gson.internal.bind.c(lVar);
        boolean z = cVar.f54668a;
        cVar.f54668a = true;
        try {
            cVar.f();
            a aVar = a.get((Class) cls);
            f fVar = this.gson;
            if (!TextUtils.isEmpty(this.path)) {
                str2 = this.path + "." + str2;
            }
            Object read = new DefaultValueMessageTypeAdapter(fVar, aVar, str2, message, this.listener).read((com.google.gson.c.a) cVar);
            cVar.f54668a = z;
            return read;
        } catch (EOFException e2) {
            if (1 != 0) {
                cVar.f54668a = z;
                return null;
            }
            throw new t(e2);
        } catch (IllegalStateException e3) {
            throw new t(e3);
        } catch (IOException e4) {
            throw new t(e4);
        } catch (AssertionError e5) {
            throw new t("AssertionError (GSON 2.8.5): " + e5.getMessage(), e5);
        } catch (Throwable th) {
            cVar.f54668a = z;
            throw th;
        }
    }

    private Object parseValue(FieldBinding<?, ?> fieldBinding, l lVar, String str, Object obj) {
        if (fieldBinding.label.isRepeated()) {
            if (lVar instanceof n) {
                return Collections.emptyList();
            }
            Class<?> cls = fieldBinding.singleAdapter().javaType;
            i k2 = lVar.k();
            ArrayList arrayList = new ArrayList(k2.a());
            Iterator<l> it = k2.iterator();
            while (it.hasNext()) {
                arrayList.add(this.gson.a(it.next(), (Class) cls));
            }
            return arrayList;
        } else if (!fieldBinding.isMap()) {
            return fromJson(lVar, (Class<T>) fieldBinding.singleAdapter().javaType, str, obj);
        } else {
            if (lVar instanceof n) {
                return Collections.emptyMap();
            }
            Class<?> cls2 = fieldBinding.keyAdapter().javaType;
            Class<?> cls3 = fieldBinding.singleAdapter().javaType;
            o j2 = lVar.j();
            LinkedHashMap linkedHashMap = new LinkedHashMap(j2.f54898a.size());
            for (Map.Entry<String, l> entry : j2.f54898a.entrySet()) {
                linkedHashMap.put(this.gson.a(entry.getKey(), (Class) cls2), this.gson.a(entry.getValue(), (Class) cls3));
            }
            return linkedHashMap;
        }
    }

    DefaultValueMessageTypeAdapter(f fVar, a<M> aVar, String str, M m2, WireDeserializeErrorListener wireDeserializeErrorListener) {
        this.gson = fVar;
        RuntimeMessageAdapter<M, B> create = WireFiledWorkaround.create(aVar.rawType);
        this.messageAdapter = create;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (FieldBinding<M, B> fieldBinding : create.fieldBindings().values()) {
            linkedHashMap.put(fieldBinding.name, fieldBinding);
        }
        this.fieldBindings = Collections.unmodifiableMap(linkedHashMap);
        this.type = aVar;
        this.defaultValue = m2;
        this.path = str;
        this.listener = wireDeserializeErrorListener;
    }
}
