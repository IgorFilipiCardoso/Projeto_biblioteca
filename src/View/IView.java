package View;

import java.util.List;
import DTO.*;
import View.Enum.MenuOptions;

public interface IView {

    MenuOptions showMenu();

    UserDTO readUser();

    BookDTO readBook();

    ReserveDto readReserve(List<BookDTO> books, List<UserDTO> users);

    void showAllBooks(List<BookDTO> books);

    void showReservedBooks(List<BookDTO> books);

    void showUserWithBook(List<ReserveDto> reserveds);

    void showUserWithPenality(List<UserDTO> penalizeds);

    void showLateBooking(List<ReserveDto> late);
}