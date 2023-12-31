package lux.fm.bookingservice.mapper;

import java.math.BigDecimal;
import lux.fm.bookingservice.config.MapperConfig;
import lux.fm.bookingservice.dto.booking.BookingRequestCreateDto;
import lux.fm.bookingservice.dto.booking.BookingRequestUpdateDto;
import lux.fm.bookingservice.dto.booking.BookingResponseDto;
import lux.fm.bookingservice.model.Booking;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;

@Mapper(config = MapperConfig.class)
public interface BookingMapper {
    @Mapping(source = "booking.accommodation.id", target = "accommodationId")
    BookingResponseDto toDto(Booking booking);

    Booking toModel(BookingRequestCreateDto requestCreateDto);

    void update(BookingRequestUpdateDto requestUpdateDto, @MappingTarget Booking booking);

    @Named("totalPrice")
    default BigDecimal getTotalPrice(Booking booking) {
        return booking.getTotal();
    }
}
