function merge_sorted_lists(lst1, lst2) {
    const merged_list = [];
    let x = 0;
    let y = 0;

    while (x < lst1.length && y < lst2.length) {
        if (lst1[x] < lst2[y]) {
            merged_list.push(lst1[x]);
            x++;
        } else {
            merged_list.push(lst2[y]);
            y++;
        }
    }
    while (x < lst1.length) {
        merged_list.push(lst1[x]);
        x++;
    }
    while (y < lst2.length) {
        merged_list.push(lst2[y]);
        y++;
    }
    return merged_list;
}

const first_list = [1,3,4,5];
const second_list = [2,6,7,8]
console.log(merge_sorted_lists(first_list, second_list));