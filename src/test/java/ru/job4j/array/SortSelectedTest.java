package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenNeed3Sort() {
        int[] data = new int[] {1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenNeed5Sort() {
        int[] data = new int[] {1, 2, 5, 7, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 2, 5, 7};
        assertThat(result).containsExactly(expected);
    }
    /*Коментарий который пришлось добавить, чтобы этот файл попал в комит*/
}