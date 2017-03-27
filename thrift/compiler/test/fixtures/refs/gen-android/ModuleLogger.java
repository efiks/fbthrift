/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */


import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.facebook.thrift.lite.*;
import com.facebook.thrift.lite.protocol.*;
import com.facebook.thrift.lite.annotations.*;


public class ModuleLogger {

  public final Module.EventType mEventType;

  private final Map<ThriftProperty<?>, Object> mMap = new HashMap<ThriftProperty<?>, Object>();

  public ModuleLogger(Module.EventType type) {
    mEventType = type;
  }

  public <T> ModuleLogger addProperty(ThriftProperty<T> property, T value) {
    mMap.put(property, value);
    return this;
  }

  public static <T> void writeFieldBegin(TBinaryProtocol oprot, ThriftProperty<T> field) throws IOException {
    TField tField = new TField(field.key, field.type, field.id);
    oprot.writeFieldBegin(tField);
  }

  public void write(TBinaryProtocol oprot) throws IOException {
    switch (mEventType) {
      case MyUnion: {
        if (this.mMap.size() < 1) {
          throw new TProtocolException(TProtocolException.MISSING_REQUIRED_FIELD, "Cannot write a union with no set value!");
        } else if (this.mMap.size() > 1) {
          throw new TProtocolException(TProtocolException.INVALID_DATA, "Cannot write a union with more than one set value!");
        }
        oprot.writeStructBegin(new TStruct("MyUnion"));
        switch (mMap.keySet().iterator().next().id) {
        case 1: {
          writeFieldBegin(oprot, Module.MyUnion_anInteger);
          oprot.writeI32((int) mMap.get(Module.MyUnion_anInteger));
          oprot.writeFieldEnd();
          break;
        }
      
        case 2: {
          writeFieldBegin(oprot, Module.MyUnion_aString);
          oprot.writeString((String) mMap.get(Module.MyUnion_aString));
          oprot.writeFieldEnd();
          break;
        }
      
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
        break;
      }
      
      case MyField: {
        oprot.writeStructBegin(new TStruct("MyField"));
        if (mMap.containsKey(Module.MyField_opt_value) && mMap.get(Module.MyField_opt_value) != null) {
          writeFieldBegin(oprot, Module.MyField_opt_value);
          oprot.writeI64((long) mMap.get(Module.MyField_opt_value));
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.MyField_value) && mMap.get(Module.MyField_value) != null) {
          writeFieldBegin(oprot, Module.MyField_value);
          oprot.writeI64((long) mMap.get(Module.MyField_value));
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.MyField_req_value) && mMap.get(Module.MyField_req_value) != null) {
          writeFieldBegin(oprot, Module.MyField_req_value);
          oprot.writeI64((long) mMap.get(Module.MyField_req_value));
          oprot.writeFieldEnd();
        } else {
          throw new TProtocolException(TProtocolException.MISSING_REQUIRED_FIELD, "Required field 'MyField.req_value' was not present!");
        }
      
        oprot.writeFieldStop();
        oprot.writeStructEnd();
        break;
      }
      
      case MyStruct: {
        oprot.writeStructBegin(new TStruct("MyStruct"));
        if (mMap.containsKey(Module.MyStruct_opt_ref) && mMap.get(Module.MyStruct_opt_ref) != null) {
          writeFieldBegin(oprot, Module.MyStruct_opt_ref);
          ((ModuleLogger) mMap.get(Module.MyStruct_opt_ref)).write(oprot);
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.MyStruct_ref) && mMap.get(Module.MyStruct_ref) != null) {
          writeFieldBegin(oprot, Module.MyStruct_ref);
          ((ModuleLogger) mMap.get(Module.MyStruct_ref)).write(oprot);
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.MyStruct_req_ref) && mMap.get(Module.MyStruct_req_ref) != null) {
          writeFieldBegin(oprot, Module.MyStruct_req_ref);
          ((ModuleLogger) mMap.get(Module.MyStruct_req_ref)).write(oprot);
          oprot.writeFieldEnd();
        } else {
          throw new TProtocolException(TProtocolException.MISSING_REQUIRED_FIELD, "Required field 'MyStruct.req_ref' was not present!");
        }
      
        oprot.writeFieldStop();
        oprot.writeStructEnd();
        break;
      }
      
      case StructWithUnion: {
        oprot.writeStructBegin(new TStruct("StructWithUnion"));
        if (mMap.containsKey(Module.StructWithUnion_u) && mMap.get(Module.StructWithUnion_u) != null) {
          writeFieldBegin(oprot, Module.StructWithUnion_u);
          ((ModuleLogger) mMap.get(Module.StructWithUnion_u)).write(oprot);
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.StructWithUnion_aDouble) && mMap.get(Module.StructWithUnion_aDouble) != null) {
          writeFieldBegin(oprot, Module.StructWithUnion_aDouble);
          oprot.writeDouble((double) mMap.get(Module.StructWithUnion_aDouble));
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.StructWithUnion_f) && mMap.get(Module.StructWithUnion_f) != null) {
          writeFieldBegin(oprot, Module.StructWithUnion_f);
          ((ModuleLogger) mMap.get(Module.StructWithUnion_f)).write(oprot);
          oprot.writeFieldEnd();
        }
      
        oprot.writeFieldStop();
        oprot.writeStructEnd();
        break;
      }
      
      case RecursiveStruct: {
        oprot.writeStructBegin(new TStruct("RecursiveStruct"));
        if (mMap.containsKey(Module.RecursiveStruct_mes) && mMap.get(Module.RecursiveStruct_mes) != null) {
          writeFieldBegin(oprot, Module.RecursiveStruct_mes);
          List<ModuleLogger> var0 = (List<ModuleLogger>) mMap.get(Module.RecursiveStruct_mes);
          oprot.writeListBegin(new TList(TType.STRUCT, var0.size()));
          for (ModuleLogger iter0 : var0) {
            iter0.write(oprot);
          }
          oprot.writeListEnd();
          oprot.writeFieldEnd();
        }
      
        oprot.writeFieldStop();
        oprot.writeStructEnd();
        break;
      }
      
      case StructWithContainers: {
        oprot.writeStructBegin(new TStruct("StructWithContainers"));
        if (mMap.containsKey(Module.StructWithContainers_list_ref) && mMap.get(Module.StructWithContainers_list_ref) != null) {
          writeFieldBegin(oprot, Module.StructWithContainers_list_ref);
          List<Integer> var0 = (List<Integer>) mMap.get(Module.StructWithContainers_list_ref);
          oprot.writeListBegin(new TList(TType.I32, var0.size()));
          for (int iter0 : var0) {
            oprot.writeI32(iter0);
          }
          oprot.writeListEnd();
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.StructWithContainers_set_ref) && mMap.get(Module.StructWithContainers_set_ref) != null) {
          writeFieldBegin(oprot, Module.StructWithContainers_set_ref);
          Set<Integer> var0 = (Set<Integer>) mMap.get(Module.StructWithContainers_set_ref);
          oprot.writeSetBegin(new TSet(TType.I32, var0.size()));
          for(int iter0 : var0) {
            oprot.writeI32(iter0);
          }
          oprot.writeSetEnd();
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.StructWithContainers_map_ref) && mMap.get(Module.StructWithContainers_map_ref) != null) {
          writeFieldBegin(oprot, Module.StructWithContainers_map_ref);
          Map<Integer,Integer> var0 = (Map<Integer,Integer>) mMap.get(Module.StructWithContainers_map_ref);
          oprot.writeMapBegin(new TMap(TType.I32, TType.I32, var0.size()));
          for (Map.Entry<Integer, Integer> iter0 : var0.entrySet()) {
            oprot.writeI32(iter0.getKey());
            oprot.writeI32(iter0.getValue());
          }
          oprot.writeMapEnd();
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.StructWithContainers_list_ref_unique) && mMap.get(Module.StructWithContainers_list_ref_unique) != null) {
          writeFieldBegin(oprot, Module.StructWithContainers_list_ref_unique);
          List<Integer> var0 = (List<Integer>) mMap.get(Module.StructWithContainers_list_ref_unique);
          oprot.writeListBegin(new TList(TType.I32, var0.size()));
          for (int iter0 : var0) {
            oprot.writeI32(iter0);
          }
          oprot.writeListEnd();
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.StructWithContainers_set_ref_shared) && mMap.get(Module.StructWithContainers_set_ref_shared) != null) {
          writeFieldBegin(oprot, Module.StructWithContainers_set_ref_shared);
          Set<Integer> var0 = (Set<Integer>) mMap.get(Module.StructWithContainers_set_ref_shared);
          oprot.writeSetBegin(new TSet(TType.I32, var0.size()));
          for(int iter0 : var0) {
            oprot.writeI32(iter0);
          }
          oprot.writeSetEnd();
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.StructWithContainers_list_ref_shared_const) && mMap.get(Module.StructWithContainers_list_ref_shared_const) != null) {
          writeFieldBegin(oprot, Module.StructWithContainers_list_ref_shared_const);
          List<Integer> var0 = (List<Integer>) mMap.get(Module.StructWithContainers_list_ref_shared_const);
          oprot.writeListBegin(new TList(TType.I32, var0.size()));
          for (int iter0 : var0) {
            oprot.writeI32(iter0);
          }
          oprot.writeListEnd();
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.StructWithContainers_set_custom_ref) && mMap.get(Module.StructWithContainers_set_custom_ref) != null) {
          writeFieldBegin(oprot, Module.StructWithContainers_set_custom_ref);
          Set<Integer> var0 = (Set<Integer>) mMap.get(Module.StructWithContainers_set_custom_ref);
          oprot.writeSetBegin(new TSet(TType.I32, var0.size()));
          for(int iter0 : var0) {
            oprot.writeI32(iter0);
          }
          oprot.writeSetEnd();
          oprot.writeFieldEnd();
        }
      
        oprot.writeFieldStop();
        oprot.writeStructEnd();
        break;
      }
      
      case StructWithSharedConst: {
        oprot.writeStructBegin(new TStruct("StructWithSharedConst"));
        if (mMap.containsKey(Module.StructWithSharedConst_opt_shared_const) && mMap.get(Module.StructWithSharedConst_opt_shared_const) != null) {
          writeFieldBegin(oprot, Module.StructWithSharedConst_opt_shared_const);
          ((ModuleLogger) mMap.get(Module.StructWithSharedConst_opt_shared_const)).write(oprot);
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.StructWithSharedConst_shared_const) && mMap.get(Module.StructWithSharedConst_shared_const) != null) {
          writeFieldBegin(oprot, Module.StructWithSharedConst_shared_const);
          ((ModuleLogger) mMap.get(Module.StructWithSharedConst_shared_const)).write(oprot);
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.StructWithSharedConst_req_shared_const) && mMap.get(Module.StructWithSharedConst_req_shared_const) != null) {
          writeFieldBegin(oprot, Module.StructWithSharedConst_req_shared_const);
          ((ModuleLogger) mMap.get(Module.StructWithSharedConst_req_shared_const)).write(oprot);
          oprot.writeFieldEnd();
        } else {
          throw new TProtocolException(TProtocolException.MISSING_REQUIRED_FIELD, "Required field 'StructWithSharedConst.req_shared_const' was not present!");
        }
      
        oprot.writeFieldStop();
        oprot.writeStructEnd();
        break;
      }
      
      case StructWithRef: {
        oprot.writeStructBegin(new TStruct("StructWithRef"));
        if (mMap.containsKey(Module.StructWithRef_def_field) && mMap.get(Module.StructWithRef_def_field) != null) {
          writeFieldBegin(oprot, Module.StructWithRef_def_field);
          ((ModuleLogger) mMap.get(Module.StructWithRef_def_field)).write(oprot);
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.StructWithRef_opt_field) && mMap.get(Module.StructWithRef_opt_field) != null) {
          writeFieldBegin(oprot, Module.StructWithRef_opt_field);
          ((ModuleLogger) mMap.get(Module.StructWithRef_opt_field)).write(oprot);
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.StructWithRef_req_field) && mMap.get(Module.StructWithRef_req_field) != null) {
          writeFieldBegin(oprot, Module.StructWithRef_req_field);
          ((ModuleLogger) mMap.get(Module.StructWithRef_req_field)).write(oprot);
          oprot.writeFieldEnd();
        } else {
          throw new TProtocolException(TProtocolException.MISSING_REQUIRED_FIELD, "Required field 'StructWithRef.req_field' was not present!");
        }
      
        oprot.writeFieldStop();
        oprot.writeStructEnd();
        break;
      }
      
      case StructWithRefTypeUnique: {
        oprot.writeStructBegin(new TStruct("StructWithRefTypeUnique"));
        if (mMap.containsKey(Module.StructWithRefTypeUnique_def_field) && mMap.get(Module.StructWithRefTypeUnique_def_field) != null) {
          writeFieldBegin(oprot, Module.StructWithRefTypeUnique_def_field);
          ((ModuleLogger) mMap.get(Module.StructWithRefTypeUnique_def_field)).write(oprot);
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.StructWithRefTypeUnique_opt_field) && mMap.get(Module.StructWithRefTypeUnique_opt_field) != null) {
          writeFieldBegin(oprot, Module.StructWithRefTypeUnique_opt_field);
          ((ModuleLogger) mMap.get(Module.StructWithRefTypeUnique_opt_field)).write(oprot);
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.StructWithRefTypeUnique_req_field) && mMap.get(Module.StructWithRefTypeUnique_req_field) != null) {
          writeFieldBegin(oprot, Module.StructWithRefTypeUnique_req_field);
          ((ModuleLogger) mMap.get(Module.StructWithRefTypeUnique_req_field)).write(oprot);
          oprot.writeFieldEnd();
        } else {
          throw new TProtocolException(TProtocolException.MISSING_REQUIRED_FIELD, "Required field 'StructWithRefTypeUnique.req_field' was not present!");
        }
      
        oprot.writeFieldStop();
        oprot.writeStructEnd();
        break;
      }
      
      case StructWithRefTypeShared: {
        oprot.writeStructBegin(new TStruct("StructWithRefTypeShared"));
        if (mMap.containsKey(Module.StructWithRefTypeShared_def_field) && mMap.get(Module.StructWithRefTypeShared_def_field) != null) {
          writeFieldBegin(oprot, Module.StructWithRefTypeShared_def_field);
          ((ModuleLogger) mMap.get(Module.StructWithRefTypeShared_def_field)).write(oprot);
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.StructWithRefTypeShared_opt_field) && mMap.get(Module.StructWithRefTypeShared_opt_field) != null) {
          writeFieldBegin(oprot, Module.StructWithRefTypeShared_opt_field);
          ((ModuleLogger) mMap.get(Module.StructWithRefTypeShared_opt_field)).write(oprot);
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.StructWithRefTypeShared_req_field) && mMap.get(Module.StructWithRefTypeShared_req_field) != null) {
          writeFieldBegin(oprot, Module.StructWithRefTypeShared_req_field);
          ((ModuleLogger) mMap.get(Module.StructWithRefTypeShared_req_field)).write(oprot);
          oprot.writeFieldEnd();
        } else {
          throw new TProtocolException(TProtocolException.MISSING_REQUIRED_FIELD, "Required field 'StructWithRefTypeShared.req_field' was not present!");
        }
      
        oprot.writeFieldStop();
        oprot.writeStructEnd();
        break;
      }
      
      case StructWithRefTypeSharedConst: {
        oprot.writeStructBegin(new TStruct("StructWithRefTypeSharedConst"));
        if (mMap.containsKey(Module.StructWithRefTypeSharedConst_def_field) && mMap.get(Module.StructWithRefTypeSharedConst_def_field) != null) {
          writeFieldBegin(oprot, Module.StructWithRefTypeSharedConst_def_field);
          ((ModuleLogger) mMap.get(Module.StructWithRefTypeSharedConst_def_field)).write(oprot);
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.StructWithRefTypeSharedConst_opt_field) && mMap.get(Module.StructWithRefTypeSharedConst_opt_field) != null) {
          writeFieldBegin(oprot, Module.StructWithRefTypeSharedConst_opt_field);
          ((ModuleLogger) mMap.get(Module.StructWithRefTypeSharedConst_opt_field)).write(oprot);
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.StructWithRefTypeSharedConst_req_field) && mMap.get(Module.StructWithRefTypeSharedConst_req_field) != null) {
          writeFieldBegin(oprot, Module.StructWithRefTypeSharedConst_req_field);
          ((ModuleLogger) mMap.get(Module.StructWithRefTypeSharedConst_req_field)).write(oprot);
          oprot.writeFieldEnd();
        } else {
          throw new TProtocolException(TProtocolException.MISSING_REQUIRED_FIELD, "Required field 'StructWithRefTypeSharedConst.req_field' was not present!");
        }
      
        oprot.writeFieldStop();
        oprot.writeStructEnd();
        break;
      }
      
      case StructWithRefTypeCustom: {
        oprot.writeStructBegin(new TStruct("StructWithRefTypeCustom"));
        if (mMap.containsKey(Module.StructWithRefTypeCustom_def_field) && mMap.get(Module.StructWithRefTypeCustom_def_field) != null) {
          writeFieldBegin(oprot, Module.StructWithRefTypeCustom_def_field);
          ((ModuleLogger) mMap.get(Module.StructWithRefTypeCustom_def_field)).write(oprot);
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.StructWithRefTypeCustom_opt_field) && mMap.get(Module.StructWithRefTypeCustom_opt_field) != null) {
          writeFieldBegin(oprot, Module.StructWithRefTypeCustom_opt_field);
          ((ModuleLogger) mMap.get(Module.StructWithRefTypeCustom_opt_field)).write(oprot);
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.StructWithRefTypeCustom_req_field) && mMap.get(Module.StructWithRefTypeCustom_req_field) != null) {
          writeFieldBegin(oprot, Module.StructWithRefTypeCustom_req_field);
          ((ModuleLogger) mMap.get(Module.StructWithRefTypeCustom_req_field)).write(oprot);
          oprot.writeFieldEnd();
        } else {
          throw new TProtocolException(TProtocolException.MISSING_REQUIRED_FIELD, "Required field 'StructWithRefTypeCustom.req_field' was not present!");
        }
      
        oprot.writeFieldStop();
        oprot.writeStructEnd();
        break;
      }
      
      
    }
  }
}
