/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#include "thrift/compiler/test/fixtures/exceptions/gen-cpp2/module_types.h"
#include "thrift/compiler/test/fixtures/exceptions/gen-cpp2/module_types.tcc"

#include <thrift/lib/cpp2/gen/module_types_cpp.h>

#include "thrift/compiler/test/fixtures/exceptions/gen-cpp2/module_data.h"


namespace apache {
namespace thrift {
namespace detail {

void TccStructTraits<::cpp2::Banal>::translateFieldName(
    FOLLY_MAYBE_UNUSED folly::StringPiece _fname,
    FOLLY_MAYBE_UNUSED int16_t& fid,
    FOLLY_MAYBE_UNUSED apache::thrift::protocol::TType& _ftype) {
  if (false) {}
}
void TccStructTraits<::cpp2::Fiery>::translateFieldName(
    FOLLY_MAYBE_UNUSED folly::StringPiece _fname,
    FOLLY_MAYBE_UNUSED int16_t& fid,
    FOLLY_MAYBE_UNUSED apache::thrift::protocol::TType& _ftype) {
  if (false) {}
  else if (_fname == "message") {
    fid = 1;
    _ftype = apache::thrift::protocol::T_STRING;
  }
}
void TccStructTraits<::cpp2::Serious>::translateFieldName(
    FOLLY_MAYBE_UNUSED folly::StringPiece _fname,
    FOLLY_MAYBE_UNUSED int16_t& fid,
    FOLLY_MAYBE_UNUSED apache::thrift::protocol::TType& _ftype) {
  if (false) {}
  else if (_fname == "sonnet") {
    fid = 1;
    _ftype = apache::thrift::protocol::T_STRING;
  }
}
void TccStructTraits<::cpp2::ComplexFieldNames>::translateFieldName(
    FOLLY_MAYBE_UNUSED folly::StringPiece _fname,
    FOLLY_MAYBE_UNUSED int16_t& fid,
    FOLLY_MAYBE_UNUSED apache::thrift::protocol::TType& _ftype) {
  if (false) {}
  else if (_fname == "error_message") {
    fid = 1;
    _ftype = apache::thrift::protocol::T_STRING;
  }
  else if (_fname == "internal_error_message") {
    fid = 2;
    _ftype = apache::thrift::protocol::T_STRING;
  }
}
void TccStructTraits<::cpp2::CustomFieldNames>::translateFieldName(
    FOLLY_MAYBE_UNUSED folly::StringPiece _fname,
    FOLLY_MAYBE_UNUSED int16_t& fid,
    FOLLY_MAYBE_UNUSED apache::thrift::protocol::TType& _ftype) {
  if (false) {}
  else if (_fname == "error_message") {
    fid = 1;
    _ftype = apache::thrift::protocol::T_STRING;
  }
  else if (_fname == "internal_error_message") {
    fid = 2;
    _ftype = apache::thrift::protocol::T_STRING;
  }
}

} // namespace detail
} // namespace thrift
} // namespace apache

namespace cpp2 {

THRIFT_IGNORE_ISSET_USE_WARNING_BEGIN
Banal::Banal(apache::thrift::FragileConstructor) {}
THRIFT_IGNORE_ISSET_USE_WARNING_END
void Banal::__clear() {
  // clear all fields
}

bool Banal::operator==(const Banal& rhs) const {
  (void)rhs;
  auto& lhs = *this;
  (void)lhs;
  return true;
}

bool Banal::operator<(const Banal& rhs) const {
  (void)rhs;
  auto& lhs = *this;
  (void)lhs;
  return false;
}


void swap(Banal& a, Banal& b) {
  using ::std::swap;
  (void)a;
  (void)b;
}

template void Banal::readNoXfer<>(apache::thrift::BinaryProtocolReader*);
template uint32_t Banal::write<>(apache::thrift::BinaryProtocolWriter*) const;
template uint32_t Banal::serializedSize<>(apache::thrift::BinaryProtocolWriter const*) const;
template uint32_t Banal::serializedSizeZC<>(apache::thrift::BinaryProtocolWriter const*) const;
template void Banal::readNoXfer<>(apache::thrift::CompactProtocolReader*);
template uint32_t Banal::write<>(apache::thrift::CompactProtocolWriter*) const;
template uint32_t Banal::serializedSize<>(apache::thrift::CompactProtocolWriter const*) const;
template uint32_t Banal::serializedSizeZC<>(apache::thrift::CompactProtocolWriter const*) const;

} // cpp2
namespace cpp2 {

THRIFT_IGNORE_ISSET_USE_WARNING_BEGIN
Fiery::Fiery(apache::thrift::FragileConstructor, ::std::string message__arg) :
    message(std::move(message__arg)) {}
THRIFT_IGNORE_ISSET_USE_WARNING_END
void Fiery::__clear() {
  // clear all fields
  message = apache::thrift::StringTraits< std::string>::fromStringLiteral("");
}

bool Fiery::operator==(const Fiery& rhs) const {
  (void)rhs;
  auto& lhs = *this;
  (void)lhs;
  if (!(lhs.message == rhs.message)) {
    return false;
  }
  return true;
}

bool Fiery::operator<(const Fiery& rhs) const {
  (void)rhs;
  auto& lhs = *this;
  (void)lhs;
  if (!(lhs.message == rhs.message)) {
    return lhs.message < rhs.message;
  }
  return false;
}


void swap(Fiery& a, Fiery& b) {
  using ::std::swap;
  swap(a.message, b.message);
}

template void Fiery::readNoXfer<>(apache::thrift::BinaryProtocolReader*);
template uint32_t Fiery::write<>(apache::thrift::BinaryProtocolWriter*) const;
template uint32_t Fiery::serializedSize<>(apache::thrift::BinaryProtocolWriter const*) const;
template uint32_t Fiery::serializedSizeZC<>(apache::thrift::BinaryProtocolWriter const*) const;
template void Fiery::readNoXfer<>(apache::thrift::CompactProtocolReader*);
template uint32_t Fiery::write<>(apache::thrift::CompactProtocolWriter*) const;
template uint32_t Fiery::serializedSize<>(apache::thrift::CompactProtocolWriter const*) const;
template uint32_t Fiery::serializedSizeZC<>(apache::thrift::CompactProtocolWriter const*) const;

} // cpp2
namespace cpp2 {

THRIFT_IGNORE_ISSET_USE_WARNING_BEGIN
Serious::Serious(apache::thrift::FragileConstructor, ::std::string sonnet__arg) :
    sonnet(std::move(sonnet__arg)) {
  __isset.sonnet = true;
}
THRIFT_IGNORE_ISSET_USE_WARNING_END
void Serious::__clear() {
  // clear all fields
  sonnet = apache::thrift::StringTraits< std::string>::fromStringLiteral("");
THRIFT_IGNORE_ISSET_USE_WARNING_BEGIN
  __isset = {};
THRIFT_IGNORE_ISSET_USE_WARNING_END
}

bool Serious::operator==(const Serious& rhs) const {
  (void)rhs;
  auto& lhs = *this;
  (void)lhs;
  if (lhs.sonnet_ref().has_value() != rhs.sonnet_ref().has_value()) {
    return false;
  }
  if (lhs.sonnet_ref().has_value()) {
    if (!(lhs.sonnet == rhs.sonnet)) {
      return false;
    }
  }
  return true;
}

bool Serious::operator<(const Serious& rhs) const {
  (void)rhs;
  auto& lhs = *this;
  (void)lhs;
  if (lhs.sonnet_ref().has_value() != rhs.sonnet_ref().has_value()) {
    return lhs.sonnet_ref().has_value() < rhs.sonnet_ref().has_value();
  }
  if (lhs.sonnet_ref().has_value()) {
    if (!(lhs.sonnet == rhs.sonnet)) {
      return lhs.sonnet < rhs.sonnet;
    }
  }
  return false;
}


void swap(Serious& a, Serious& b) {
  using ::std::swap;
  swap(a.sonnet_ref().value_unchecked(), b.sonnet_ref().value_unchecked());
THRIFT_IGNORE_ISSET_USE_WARNING_BEGIN
  swap(a.__isset, b.__isset);
THRIFT_IGNORE_ISSET_USE_WARNING_END
}

template void Serious::readNoXfer<>(apache::thrift::BinaryProtocolReader*);
template uint32_t Serious::write<>(apache::thrift::BinaryProtocolWriter*) const;
template uint32_t Serious::serializedSize<>(apache::thrift::BinaryProtocolWriter const*) const;
template uint32_t Serious::serializedSizeZC<>(apache::thrift::BinaryProtocolWriter const*) const;
template void Serious::readNoXfer<>(apache::thrift::CompactProtocolReader*);
template uint32_t Serious::write<>(apache::thrift::CompactProtocolWriter*) const;
template uint32_t Serious::serializedSize<>(apache::thrift::CompactProtocolWriter const*) const;
template uint32_t Serious::serializedSizeZC<>(apache::thrift::CompactProtocolWriter const*) const;

} // cpp2
namespace cpp2 {

THRIFT_IGNORE_ISSET_USE_WARNING_BEGIN
ComplexFieldNames::ComplexFieldNames(apache::thrift::FragileConstructor, ::std::string error_message__arg, ::std::string internal_error_message__arg) :
    error_message(std::move(error_message__arg)),
    internal_error_message(std::move(internal_error_message__arg)) {
  __isset.error_message = true;
  __isset.internal_error_message = true;
}
THRIFT_IGNORE_ISSET_USE_WARNING_END
void ComplexFieldNames::__clear() {
  // clear all fields
  error_message = apache::thrift::StringTraits< std::string>::fromStringLiteral("");
  internal_error_message = apache::thrift::StringTraits< std::string>::fromStringLiteral("");
THRIFT_IGNORE_ISSET_USE_WARNING_BEGIN
  __isset = {};
THRIFT_IGNORE_ISSET_USE_WARNING_END
}

bool ComplexFieldNames::operator==(const ComplexFieldNames& rhs) const {
  (void)rhs;
  auto& lhs = *this;
  (void)lhs;
  if (!(lhs.error_message == rhs.error_message)) {
    return false;
  }
  if (!(lhs.internal_error_message == rhs.internal_error_message)) {
    return false;
  }
  return true;
}

bool ComplexFieldNames::operator<(const ComplexFieldNames& rhs) const {
  (void)rhs;
  auto& lhs = *this;
  (void)lhs;
  if (!(lhs.error_message == rhs.error_message)) {
    return lhs.error_message < rhs.error_message;
  }
  if (!(lhs.internal_error_message == rhs.internal_error_message)) {
    return lhs.internal_error_message < rhs.internal_error_message;
  }
  return false;
}


void swap(ComplexFieldNames& a, ComplexFieldNames& b) {
  using ::std::swap;
  swap(a.error_message, b.error_message);
  swap(a.internal_error_message, b.internal_error_message);
THRIFT_IGNORE_ISSET_USE_WARNING_BEGIN
  swap(a.__isset, b.__isset);
THRIFT_IGNORE_ISSET_USE_WARNING_END
}

template void ComplexFieldNames::readNoXfer<>(apache::thrift::BinaryProtocolReader*);
template uint32_t ComplexFieldNames::write<>(apache::thrift::BinaryProtocolWriter*) const;
template uint32_t ComplexFieldNames::serializedSize<>(apache::thrift::BinaryProtocolWriter const*) const;
template uint32_t ComplexFieldNames::serializedSizeZC<>(apache::thrift::BinaryProtocolWriter const*) const;
template void ComplexFieldNames::readNoXfer<>(apache::thrift::CompactProtocolReader*);
template uint32_t ComplexFieldNames::write<>(apache::thrift::CompactProtocolWriter*) const;
template uint32_t ComplexFieldNames::serializedSize<>(apache::thrift::CompactProtocolWriter const*) const;
template uint32_t ComplexFieldNames::serializedSizeZC<>(apache::thrift::CompactProtocolWriter const*) const;

} // cpp2
namespace cpp2 {

THRIFT_IGNORE_ISSET_USE_WARNING_BEGIN
CustomFieldNames::CustomFieldNames(apache::thrift::FragileConstructor, ::std::string error_message__arg, ::std::string internal_error_message__arg) :
    error_message(std::move(error_message__arg)),
    internal_error_message(std::move(internal_error_message__arg)) {
  __isset.error_message = true;
  __isset.internal_error_message = true;
}
THRIFT_IGNORE_ISSET_USE_WARNING_END
void CustomFieldNames::__clear() {
  // clear all fields
  error_message = apache::thrift::StringTraits< std::string>::fromStringLiteral("");
  internal_error_message = apache::thrift::StringTraits< std::string>::fromStringLiteral("");
THRIFT_IGNORE_ISSET_USE_WARNING_BEGIN
  __isset = {};
THRIFT_IGNORE_ISSET_USE_WARNING_END
}

bool CustomFieldNames::operator==(const CustomFieldNames& rhs) const {
  (void)rhs;
  auto& lhs = *this;
  (void)lhs;
  if (!(lhs.error_message == rhs.error_message)) {
    return false;
  }
  if (!(lhs.internal_error_message == rhs.internal_error_message)) {
    return false;
  }
  return true;
}

bool CustomFieldNames::operator<(const CustomFieldNames& rhs) const {
  (void)rhs;
  auto& lhs = *this;
  (void)lhs;
  if (!(lhs.error_message == rhs.error_message)) {
    return lhs.error_message < rhs.error_message;
  }
  if (!(lhs.internal_error_message == rhs.internal_error_message)) {
    return lhs.internal_error_message < rhs.internal_error_message;
  }
  return false;
}


void swap(CustomFieldNames& a, CustomFieldNames& b) {
  using ::std::swap;
  swap(a.error_message, b.error_message);
  swap(a.internal_error_message, b.internal_error_message);
THRIFT_IGNORE_ISSET_USE_WARNING_BEGIN
  swap(a.__isset, b.__isset);
THRIFT_IGNORE_ISSET_USE_WARNING_END
}

template void CustomFieldNames::readNoXfer<>(apache::thrift::BinaryProtocolReader*);
template uint32_t CustomFieldNames::write<>(apache::thrift::BinaryProtocolWriter*) const;
template uint32_t CustomFieldNames::serializedSize<>(apache::thrift::BinaryProtocolWriter const*) const;
template uint32_t CustomFieldNames::serializedSizeZC<>(apache::thrift::BinaryProtocolWriter const*) const;
template void CustomFieldNames::readNoXfer<>(apache::thrift::CompactProtocolReader*);
template uint32_t CustomFieldNames::write<>(apache::thrift::CompactProtocolWriter*) const;
template uint32_t CustomFieldNames::serializedSize<>(apache::thrift::CompactProtocolWriter const*) const;
template uint32_t CustomFieldNames::serializedSizeZC<>(apache::thrift::CompactProtocolWriter const*) const;

} // cpp2

namespace cpp2 {
//  if this struct is generated with extern template instances for simple-json
//  protocol, enforce that all its dependencies are too
static_assert(
    ::apache::thrift::detail::st::gen_check<
        ::apache::thrift::detail::st::gen_check_get_json,
        Banal,
        ::folly::tag_t<void
          >,
        ::folly::tag_t<void
          >>,
    "inconsistent use of json option");

//  if this struct is generated with extern template instances for nimble
//  protocol, enforce that all its dependencies are too
static_assert(
    ::apache::thrift::detail::st::gen_check<
        ::apache::thrift::detail::st::gen_check_get_nimble,
        Banal,
        ::folly::tag_t<void
          >,
        ::folly::tag_t<void
          >>,
    "inconsistent use of nimble option");


//  if this struct is generated with extern template instances for simple-json
//  protocol, enforce that all its dependencies are too
static_assert(
    ::apache::thrift::detail::st::gen_check<
        ::apache::thrift::detail::st::gen_check_get_json,
        Fiery,
        ::folly::tag_t<void
          , ::apache::thrift::type_class::string
          >,
        ::folly::tag_t<void
          , ::std::string
          >>,
    "inconsistent use of json option");

//  if this struct is generated with extern template instances for nimble
//  protocol, enforce that all its dependencies are too
static_assert(
    ::apache::thrift::detail::st::gen_check<
        ::apache::thrift::detail::st::gen_check_get_nimble,
        Fiery,
        ::folly::tag_t<void
          , ::apache::thrift::type_class::string
          >,
        ::folly::tag_t<void
          , ::std::string
          >>,
    "inconsistent use of nimble option");


//  if this struct is generated with extern template instances for simple-json
//  protocol, enforce that all its dependencies are too
static_assert(
    ::apache::thrift::detail::st::gen_check<
        ::apache::thrift::detail::st::gen_check_get_json,
        Serious,
        ::folly::tag_t<void
          , ::apache::thrift::type_class::string
          >,
        ::folly::tag_t<void
          , ::std::string
          >>,
    "inconsistent use of json option");

//  if this struct is generated with extern template instances for nimble
//  protocol, enforce that all its dependencies are too
static_assert(
    ::apache::thrift::detail::st::gen_check<
        ::apache::thrift::detail::st::gen_check_get_nimble,
        Serious,
        ::folly::tag_t<void
          , ::apache::thrift::type_class::string
          >,
        ::folly::tag_t<void
          , ::std::string
          >>,
    "inconsistent use of nimble option");


//  if this struct is generated with extern template instances for simple-json
//  protocol, enforce that all its dependencies are too
static_assert(
    ::apache::thrift::detail::st::gen_check<
        ::apache::thrift::detail::st::gen_check_get_json,
        ComplexFieldNames,
        ::folly::tag_t<void
          , ::apache::thrift::type_class::string
          , ::apache::thrift::type_class::string
          >,
        ::folly::tag_t<void
          , ::std::string
          , ::std::string
          >>,
    "inconsistent use of json option");

//  if this struct is generated with extern template instances for nimble
//  protocol, enforce that all its dependencies are too
static_assert(
    ::apache::thrift::detail::st::gen_check<
        ::apache::thrift::detail::st::gen_check_get_nimble,
        ComplexFieldNames,
        ::folly::tag_t<void
          , ::apache::thrift::type_class::string
          , ::apache::thrift::type_class::string
          >,
        ::folly::tag_t<void
          , ::std::string
          , ::std::string
          >>,
    "inconsistent use of nimble option");


//  if this struct is generated with extern template instances for simple-json
//  protocol, enforce that all its dependencies are too
static_assert(
    ::apache::thrift::detail::st::gen_check<
        ::apache::thrift::detail::st::gen_check_get_json,
        CustomFieldNames,
        ::folly::tag_t<void
          , ::apache::thrift::type_class::string
          , ::apache::thrift::type_class::string
          >,
        ::folly::tag_t<void
          , ::std::string
          , ::std::string
          >>,
    "inconsistent use of json option");

//  if this struct is generated with extern template instances for nimble
//  protocol, enforce that all its dependencies are too
static_assert(
    ::apache::thrift::detail::st::gen_check<
        ::apache::thrift::detail::st::gen_check_get_nimble,
        CustomFieldNames,
        ::folly::tag_t<void
          , ::apache::thrift::type_class::string
          , ::apache::thrift::type_class::string
          >,
        ::folly::tag_t<void
          , ::std::string
          , ::std::string
          >>,
    "inconsistent use of nimble option");

} // cpp2
