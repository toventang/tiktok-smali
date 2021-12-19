package com.squareup.wire;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.a;
import com.google.gson.c.b;
import com.google.gson.c.c;
import com.google.gson.f;
import com.google.gson.i;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.v;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.WireField;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class MessageTypeAdapter<M extends Message<M, B>, B extends Message.Builder<M, B>> extends v<M> {
    private static final BigInteger POWER_64 = new BigInteger("18446744073709551616");
    private final Map<String, FieldBinding<M, B>> fieldBindings;
    private final f gson;
    private final RuntimeMessageAdapter<M, B> messageAdapter;

    static {
        Covode.recordClassIndex(36110);
    }

    @Override // com.google.gson.v
    public M read(a aVar) {
        if (aVar.f() == b.NULL) {
            aVar.k();
            return null;
        }
        v a2 = this.gson.a(l.class);
        B newBuilder = this.messageAdapter.newBuilder();
        aVar.c();
        while (aVar.f() != b.END_OBJECT) {
            FieldBinding<M, B> fieldBinding = this.fieldBindings.get(aVar.h());
            if (fieldBinding == null) {
                aVar.o();
            } else {
                fieldBinding.set(newBuilder, parseValue(fieldBinding, (l) a2.read(aVar)));
            }
        }
        aVar.d();
        return (M) newBuilder.build();
    }

    private void emitUint64(Long l2, c cVar) {
        if (l2.longValue() < 0) {
            cVar.a(POWER_64.add(BigInteger.valueOf(l2.longValue())));
        } else {
            cVar.a(l2);
        }
    }

    MessageTypeAdapter(f fVar, com.google.gson.b.a<M> aVar) {
        this.gson = fVar;
        RuntimeMessageAdapter<M, B> create = WireFiledWorkaround.create(aVar.rawType);
        this.messageAdapter = create;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (FieldBinding<M, B> fieldBinding : create.fieldBindings().values()) {
            linkedHashMap.put(fieldBinding.name, fieldBinding);
        }
        this.fieldBindings = Collections.unmodifiableMap(linkedHashMap);
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

    private Object parseValue(FieldBinding<?, ?> fieldBinding, l lVar) {
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
            return this.gson.a(lVar, (Class) fieldBinding.singleAdapter().javaType);
        } else if (lVar instanceof n) {
            return Collections.emptyMap();
        } else {
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
}
