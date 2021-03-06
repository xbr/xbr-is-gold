// automatically generated by the FlatBuffers compiler, do not modify

package io.crossbar.crossbarfxmarkets.schema.network;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
/**
 * A single location sample (mostly for on_tile_enter/on_tile_leave).
 * See also: https://developer.android.com/reference/android/net/wifi/ScanResult
 */
public final class WifiScanResult extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static WifiScanResult getRootAsWifiScanResult(ByteBuffer _bb) { return getRootAsWifiScanResult(_bb, new WifiScanResult()); }
  public static WifiScanResult getRootAsWifiScanResult(ByteBuffer _bb, WifiScanResult obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public WifiScanResult __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  /**
   * Persistent (static) ID of the entity tracking its location.
   */
  public int entity(int j) { int o = __offset(4); return o != 0 ? bb.get(__vector(o) + j * 1) & 0xFF : 0; }
  public int entityLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public ByteVector entityVector() { return entityVector(new ByteVector()); }
  public ByteVector entityVector(ByteVector obj) { int o = __offset(4); return o != 0 ? obj.__assign(__vector(o), bb) : null; }
  public ByteBuffer entityAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer entityInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  /**
   * Sample: point in time (UTC) when sample was measured, in Unix time (ns precision).
   */
  public long timestamp() { int o = __offset(6); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  /**
   * The address of the access point.
   */
  public String bssid() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer bssidAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public ByteBuffer bssidInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 1); }
  /**
   * The network name.
   */
  public String ssid() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer ssidAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public ByteBuffer ssidInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 10, 1); }
  /**
   * The primary 20 MHz frequency (in MHz) of the channel over which the client is communicating with the access point.
   */
  public long channelFrequency() { int o = __offset(12); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  /**
   * AP Channel bandwidth.
   */
  public int channelWidth() { int o = __offset(14); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  /**
   * The detected signal level in dBm.
   */
  public int rssi() { int o = __offset(16); return o != 0 ? bb.getShort(o + bb_pos) & 0xFFFF : 0; }
  /**
   * Indicates Passpoint operator name published by access point; only available on Passpoint network and if published by access point.
   */
  public String passpointOperator() { int o = __offset(18); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer passpointOperatorAsByteBuffer() { return __vector_as_bytebuffer(18, 1); }
  public ByteBuffer passpointOperatorInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 18, 1); }
  /**
   * Indicates venue name (such as 'San Francisco Airport') published by access point; only available on Passpoint network and if published by access point.
   */
  public String passpointVenue() { int o = __offset(20); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer passpointVenueAsByteBuffer() { return __vector_as_bytebuffer(20, 1); }
  public ByteBuffer passpointVenueInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 20, 1); }

  public static int createWifiScanResult(FlatBufferBuilder builder,
      int entityOffset,
      long timestamp,
      int bssidOffset,
      int ssidOffset,
      long channel_frequency,
      int channel_width,
      int rssi,
      int passpoint_operatorOffset,
      int passpoint_venueOffset) {
    builder.startTable(9);
    WifiScanResult.addTimestamp(builder, timestamp);
    WifiScanResult.addPasspointVenue(builder, passpoint_venueOffset);
    WifiScanResult.addPasspointOperator(builder, passpoint_operatorOffset);
    WifiScanResult.addChannelFrequency(builder, channel_frequency);
    WifiScanResult.addSsid(builder, ssidOffset);
    WifiScanResult.addBssid(builder, bssidOffset);
    WifiScanResult.addEntity(builder, entityOffset);
    WifiScanResult.addRssi(builder, rssi);
    WifiScanResult.addChannelWidth(builder, channel_width);
    return WifiScanResult.endWifiScanResult(builder);
  }

  public static void startWifiScanResult(FlatBufferBuilder builder) { builder.startTable(9); }
  public static void addEntity(FlatBufferBuilder builder, int entityOffset) { builder.addOffset(0, entityOffset, 0); }
  public static int createEntityVector(FlatBufferBuilder builder, byte[] data) { return builder.createByteVector(data); }
  public static int createEntityVector(FlatBufferBuilder builder, ByteBuffer data) { return builder.createByteVector(data); }
  public static void startEntityVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static void addTimestamp(FlatBufferBuilder builder, long timestamp) { builder.addLong(1, timestamp, 0L); }
  public static void addBssid(FlatBufferBuilder builder, int bssidOffset) { builder.addOffset(2, bssidOffset, 0); }
  public static void addSsid(FlatBufferBuilder builder, int ssidOffset) { builder.addOffset(3, ssidOffset, 0); }
  public static void addChannelFrequency(FlatBufferBuilder builder, long channelFrequency) { builder.addInt(4, (int)channelFrequency, (int)0L); }
  public static void addChannelWidth(FlatBufferBuilder builder, int channelWidth) { builder.addByte(5, (byte)channelWidth, (byte)0); }
  public static void addRssi(FlatBufferBuilder builder, int rssi) { builder.addShort(6, (short)rssi, (short)0); }
  public static void addPasspointOperator(FlatBufferBuilder builder, int passpointOperatorOffset) { builder.addOffset(7, passpointOperatorOffset, 0); }
  public static void addPasspointVenue(FlatBufferBuilder builder, int passpointVenueOffset) { builder.addOffset(8, passpointVenueOffset, 0); }
  public static int endWifiScanResult(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public WifiScanResult get(int j) { return get(new WifiScanResult(), j); }
    public WifiScanResult get(WifiScanResult obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

